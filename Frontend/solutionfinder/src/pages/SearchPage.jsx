import React, { useState } from "react";
import axios from "axios";
import style from "../pagescss/searchpage.module.css";


const SearchPage=()=>{

    const [ans,setAns]=useState();
    const [query,setQuery]=useState();
    const [language,setLanguage]=useState("Java Script");

    const sentQuery=(e)=>{
    
    
        const convert = async () => {
            try {
            
              const response = await axios.post('https://raj74434.pythonanywhere.com/convert', {
                "prompt":query,
                "language":language   
              });
              console.log(response.data.gpt_choice);
              setAns(response.data.gpt_choice.message.content)
            } catch (error) {
              console.error(error);
            }


          };

          convert();
        
        console.log(ans);
    
    }

    const debug = async () => {
      try {
      
        const response = await axios.post('https://raj74434.pythonanywhere.com/debug', {
          "prompt":query,
          "language":language   
        });
        console.log(response.data.gpt_choice);
        setAns(response.data.gpt_choice.message.content)
      } catch (error) {
        console.error(error);
      }
    }

      const quality = async () => {
        try {
        
          const response = await axios.post('https://raj74434.pythonanywhere.com/quality', {
            "prompt":query,
            "language":language   
          });
          console.log(response.data.gpt_choice);
          setAns(response.data.gpt_choice.message.content)
        } catch (error) {
          console.error(error);
        }
      }



    return(
        <div className={style.body}>

            <div className={style.left}>

            <textarea className={style.codetest} onChange={(e)=>setQuery(e.target.value)} rows="4" cols="35"  placeholder="Enter your code here..."></textarea>

            </div>

            <div  className={style.btns}>

            <button className={style.convert_btn}  onClick={()=>{sentQuery()}}>Convert To</button>

            <select className={style.select_language} onChange={(e)=>setLanguage(e.target.value)} name="select_language" id="select_language">
              <option  value="Java Script">Java Script</option>
              <option  value="Python">Python</option>
              <option  value="Java">Java</option>
              <option  value="C++">C++</option>
            </select>

            <hr/>

            <br/>

            <button className={style.convert_btn}  onClick={()=>{debug()}}>Debug</button>

            <br/>

            <button className={style.convert_btn}  onClick={()=>{quality()}}>Check Quality</button>


            </div>

            <div className={style.right} >
              <h3 style={{color:"#007aff"}}>Output</h3>
              <hr/>
                <div><h4>{ans}</h4></div>

                
                

            </div>



        </div>

    );

}

export default SearchPage;