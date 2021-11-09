# upwords
This project is my solution for labforward application test where I need to create 2 small new features that enable scientists to
better understand similarities in their data.

## Specifications

### User Story
* As a researcher, I would like to view the frequency of a given word and any similar
words in my lab notebook entry.

### New Feature(s)
* Determine frequency of word occurrence in notebook Entry
* Determine similar words in notebook Entry

### Specification(s)
* **Given** a basic notebook entry with the text “Word Words Wor word"\
**When** the frequency of the word “Word” is requested\
**Then** the frequency is determined to be `1`\
**And** the list of similar words is determined to be “Words", "Wor", "word"

* **Given** a basic notebook entry with the text “Word Word Word word"\
**When** the frequency of the word “Word” is requested\
**Then** the frequency is determined to be `3`\
**And** the list of similar words is determined to be “word"

## My Solutions


### Run Project
```bash
./gradlew bootRun
```

#### This application is exposed on:
```bash
localhost:8080
```
### Run Tests:
```bash
./gradlew clean test
```
### API

**POST** `/api/v1/research/findInfos`

**Request Body**
`{
    "text": "string",
    "keyWord": "string"
}`

**Response**
`{
    "wordsFrequency": 0,
    "similarWords": []
}`

**cURL**

`curl --location --request POST 'http://localhost:8080/api/v1/research/findInfos' \
--header 'Content-Type: application/json' \
--data-raw '{
    "text": "Word Words Wor word",
    "keyWord": "Word"
}'`



### Code Approach
#### Files and Packages structure 
* `v1` - in case of in the future we decided to create a new version of the API
* `model` - one for the request and the other for response (In the future, if store the infos in a database would be necessary we can do a relationship)
* `service` - each feature has their own service, in this way we can delegate responsibility
* `controller` - has our api management

#### Algorithms
For the function that retrieves the frequency of words, I decided use stream() (after see in the documentation what I can do) because is less verbose and give us a good performance for a large list (since scientists use long texts).

For the function that retrieves the similar words I thought in create my own algorithm of levenshtein distance but instead I found a library that does it (with a good performance for long texts). My thought to use it was that, in general, use a lib that is already exist solve problems in a fast way and we don't need to reinvent the wheel. Made something with the gear (and time) that you have and and then improve it.

#### Considerations
I used TDD to develop the features and refactored some parts of the code that I thought that was needed (you can see this on my commits).


### Bonus Task
Describe a user interface that utilizes your new endpoint:
#### Interface
* `Research text field` - A text area field where the user can add the whole text that they want to search similarity and frequency of words. 
* `KeyWord text field` - A text input field where the user can add the word that they want to know the similarity and frequency of words. 
* `Search button field` - A button that allow user to call the API endpoint and find the similarity and frequency of words.
* `See results field/section` - A read only field/section where the user can see the result of their search after click on the button.
* The fields must have placeholder with example of input datas in order to guide the user to add correctly the informations.

#### Accessibility
* The page should be fully responsive and consumable on devices with screen sizes from 320px wide and above.
* The page font size is set to 100%, allowing users to adjust their preferred browser font size.
* The page should allow the tab key navigates through the fields and button. The order needs to be logical and predictable.


### If I Had More Time
* I would like to add a new endpoint where the user can upload different kind of files (as researchers use lots of files for their researches) in order to take  the similarity and frequency of words . For do it I would create an Interface that should allow me implements for `pdf` files, `txt` files, and so on.
* I would like to improve the algorithms of take the similar and frequency of words in order to work better for a great amount of research texts (thousand of words)
* I would like to allow user to save their searches and do a history. For this I should create authentication and some others endpoints (create user, save searches, for example)
* Combined with the idea above, I would like to allow user to take their searches and understand patterns among the results of their searches.  

### Time Spent
I can say that I spent around **5:30h to 6h** hours on this project.

This project was not a big API but as it is a test I took time to see the best way to do the solutions, architecture, and the whole activities. Also due to personal things I needed to split the time dedicated to this project in many moments of the all days. I think those informations are relevant to understand why I took this time to finish the project.

## Appreciation

I really enjoy do this test. Thank you so much for the opportunity! :D