# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

from flask import Flask, render_template, request, jsonify
import openai
from flask_cors import CORS


main = Flask(__name__)
CORS(main)

api_key = "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"
openai.api_key = api_key



@main.route('/', methods=['GET'])
def check():
    return jsonify({ 'gpt_choice': "yes"})


@main.route('/convert', methods=['POST'])
def convert():
    data=request.json
    user_input=data.get("prompt")
    language=data.get("language")

    response = openai.ChatCompletion.create(
            model="gpt-3.5-turbo",  # Use the chat model
            messages=[
                 {"role": "system", "content": "Work as code converter.Convert given code in "+language+".Only give code without other thing. "},
                  {"role": "user", "content": user_input}]
        )

    gpt_choice = response.choices[0]
    print(gpt_choice)

        # Return both choices as JSON
    return jsonify({ 'gpt_choice': gpt_choice})
    

@main.route('/debug', methods=['POST'])
def Debug():
    data = request.json
    user_input = data.get("prompt")

    response = openai.ChatCompletion.create(
        model="gpt-3.5-turbo",  # Use the chat model
        messages=[
            {"role": "system",
             "content": "You are scenior developer. Debug the given code. In result show right code and explain problem in sort and simple language"},
            {"role": "user", "content": user_input}]
    )

    gpt_choice = response.choices[0]
    print(gpt_choice)

    # Return both choices as JSON
    return jsonify({'gpt_choice': gpt_choice})



@main.route('/quality', methods=['POST'])
def quality():
    data = request.json
    user_input = data.get("prompt")

    response = openai.ChatCompletion.create(
        model="gpt-3.5-turbo",  # Use the chat model
        messages=[
            {"role": "system",
             "content": "You are scenior developer.Do the quality check on basis of time complexity, Code Structure, Code Readability and Style, Consistency and Standards. In result only explain about problem if there is presnt and show quality in percentage "},
            {"role": "user", "content": user_input}]
    )

    gpt_choice = response.choices[0]
    print(gpt_choice)

    # Return both choices as JSON
    return jsonify({'gpt_choice': gpt_choice})



if __name__ == '__main__':
      main.run(debug=True,port=8080)

