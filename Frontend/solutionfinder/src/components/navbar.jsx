import React, { useState } from "react";
import style from "../compcss/navbar.module.css";
import {Link} from "react-router-dom"


const Navbar=()=>{


    return(
    <div className={style.navbar}>
        <div><h1 className={style.name}>Code Converter</h1> </div>

        {/* <div className={style.shayri}> <h1>Go to Shayri Creator</h1>     </div> */}

    </div>);

}


export default Navbar;