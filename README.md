# 🚀 WYLD-Algorithm

Welcome to **WYLD-Algorithm**, an innovative Spring Boot application inspired by a Shark Tank start-up idea. This project explores the world of cashback eligibility determination based on Instagram post details.

## Disclaimer
📚 This project has been created entirely for learning purposes. It serves as a demonstration of implementing a backend application using the Spring Boot framework.

## 🎯 Goal
The goal is to design and implement a robust cashback eligibility algorithm that assesses Instagram posts and determines if users are eligible for cashback based on certain criteria. This algorithm will be the backbone of the WYLD algorithm application.

## Progress
- Basic functionality implemented.
- Fetches Instagram post details using the post URL.
- Analyzes the post based on parameters such as age(How old the post is), picture count, and number of likes, etc.
- Compares post details with contract specifications.

## Data Processing
WYLD-Algorithm processes Instagram posts by analyzing various parameters, including post age, picture count, number of likes, and other relevant factors. These metrics contribute to the algorithm's decision-making process.

## Input-Output Format
- **Input:** Instagram post URL: reel/post

- **Output:** Cashback eligibility decision (Yes/No)

## Dependencies
WYLD-Algorithm utilizes the following dependencies:
- Spring Boot Starter Web: For building the RESTful API.
- [Instagram API](https://rapidapi.com/omarmhaimdat/api/instagram230) <!-- Replace '#' with the actual link to the dependencies -->

## Schemas

### Instagram Post Schema

| Field          | Type   |
| -------------- | ------ |
| postUrl        | String |
| postAge        | Integer |
| pictureCount   | Integer |
| likesCount     | Integer |
| Caption        | String |
| isPublic        | Boolean |

We can check for more comparison parameters like comments count, share count, and many other factors.

### Contract Schema 

| Field          | Type   |
| -------------- | ------ |
| Tags | List<String> |
|  MaxReedemtionPerUser | Integer |
|  minimumNumberOfLikes | Integer |
|  maxCashback | Integer |

Users can add more fields depending on the contract


### Future Versions
    - Image Recognition
    - Fetch images from posts.
    - Identify if users have posted appropriate product images.

Feel free to explore, contribute, and learn from the **WYLD-Algorithm** project. Happy coding! 🌟
