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

### Frequency of Words


