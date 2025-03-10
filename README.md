# WRITE-A-JAVA-APPLICATION-THAT-CONSUME-A-API-FETCH-WEATHER-DATA-AND-DISPLAY-THE-DATA-IN-A-FORMAT
"COMPANY NAME:CODTECH IT SOLUTIONS
"NAME":KISHORE KUMAR AYYORI
"INTERN ID":CT08RYE
"DOMAIN":JAVA PROGRAMMING
"DURATION":8 WEEKS
"MENTOR":NEELA SANTOSH

"DESCRIPTION":
I HAVE CHOOSE REPLIT BECAUSE OF BETTER USER EXPERINCE AND GIVE A COMPLETE OUTPUT PICTURE 

PROGRAM OVERVIEW
THE PROGRAM IS A JAVA-BASED APPLICATION THAT RETRIEVES AND DISPLAYS THE CURRENT WEATHER DATA FOR A SPECIFIED CITY USING THE OPENWEATHERMAP API. THE PROGRAM UTILIZES THE GSON LIBRARY TO PARSE THE JSON RESPONSE FROM THE API.

PROGRAM STRUCTURE
THE PROGRAM IS STRUCTURED INTO SEVERAL METHODS, EACH RESPONSIBLE FOR A SPECIFIC TASK:

- GETURL(): CONSTRUCTS THE URL STRING FOR THE OPENWEATHERMAP API REQUEST.
- GETCONNECTION(): ESTABLISHES AN HTTP CONNECTION TO THE OPENWEATHERMAP API USING THE CONSTRUCTED URL.
- READRESPONSE(): READS THE RESPONSE FROM THE HTTP CONNECTION AND RETURNS IT AS A STRING.
- PARSEJSON(): PARSSES THE JSON RESPONSE STRING INTO A JSONOBJECT USING THE GSON LIBRARY.
- PRINTWEATHERDATA(): EXTRACTS THE RELEVANT WEATHER DATA FROM THE JSONOBJECT AND PRINTS IT TO THE CONSOLE.

PROGRAM FLOW
THE PROGRAM FLOW IS AS FOLLOWS:

1. THE PROGRAM CONSTRUCTS THE URL STRING FOR THE OPENWEATHERMAP API REQUEST USING THE GETURL() METHOD.
2. THE PROGRAM ESTABLISHES AN HTTP CONNECTION TO THE OPENWEATHERMAP API USING THE GETCONNECTION() METHOD.
3. THE PROGRAM READS THE RESPONSE FROM THE HTTP CONNECTION USING THE READRESPONSE() METHOD.
4. THE PROGRAM PARSSES THE JSON RESPONSE STRING INTO A JSONOBJECT USING THE PARSEJSON() METHOD.
5. THE PROGRAM EXTRACTS THE RELEVANT WEATHER DATA FROM THE JSONOBJECT USING THE PRINTWEATHERDATA() METHOD.
6. THE PROGRAM PRINTS THE EXTRACTED WEATHER DATA TO THE CONSOLE.

API KEY SECURITY
THE PROGRAM USES A HARDCODED API KEY FOR DEMONSTRATION PURPOSES. HOWEVER, IN A REAL-WORLD APPLICATION, IT IS RECOMMENDED TO STORE THE API KEY SECURELY, SUCH AS USING ENVIRONMENT VARIABLES OR A SECURE STORAGE MECHANISM.

GSON LIBRARY
THE PROGRAM UTILIZES THE GSON LIBRARY TO PARSE THE JSON RESPONSE FROM THE OPENWEATHERMAP API. THE GSON LIBRARY PROVIDES A SIMPLE AND EFFICIENT WAY TO CONVERT BETWEEN JAVA OBJECTS AND JSON DATA.


"OUTPUT":
![Image](https://github.com/user-attachments/assets/574f0c01-4418-438e-bafc-a31b278f0394)
