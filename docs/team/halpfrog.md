---
layout: page
title: Sarthak Pradhan's Project Portfolio Page
---

### Project: LibTask


LibTask is a desktop application used by NUS libraries to keep track of books, overdue books, and contact details of patrons who have borrowed them and those who requested them.
The user interacts with it using a CLI, and it has a GUI created with JavaFX. It is written in Java, and has about 10 kLoC. This project is based on AddressBook - Level 3.

Given below are my contributions to the project.

* **New Feature**:
  * Added the ability for users to view their previous commands
    * What it does
      * Allows users to make changes to their previous commands if needed.
    * Justification
      * It will speed up the process should the user wish to key in multiple similar commands
      * Will also allow them to check if any of the fields were incorrectly entered.
    * Highlights
      * This command changes the way users can interact with LibTask, making it more efficient for librarians who have to do similar work repeatedly.
      * Hard to implement with the original idea of using arrow keys to navigate the previous commands as Javafx tends to consume all function keys. To work around this I decided to use the `u` key as it was a key that was least likely to cause conflicts with other features
      * It was also the only feature that would edit the CommandBox which required additional work to implement. 
      * Credits
        * Worked with [Ang Yong Liang](http://github.com/yl-ang) to make sure that the previous command would show up in the CommandBox.

  * Added the ability for users to search for a book by its category tag, author or name.
    * What it does
      * Allows users to quickly find certain books using a search query
    * Justification
      * It will make it easier for a librarian to find all books that are part of the same category or author should a student ask for similar books
      * It would also be able to search for multiple editions of the same book if they are not sure which is the one that they need to find.
    * Highlights
      * Requires more work than patron fine, to ensure that only one argument is parsed into the software since it can be one of 3.
      * The decision was also made to have it only search for a substring rather than match words exactly like `patron find`. As there can be many books with similar titles, it made more sense for it to search for parts of a title and let the user decide if that was what they were looking for. 


* **Code contributed**: [RepoSense link](https://nus-cs2103-ay2122s2.github.io/tp-dashboard/?search=&sort=groupTitle&sortWithin=title&since=2022-02-18&timeframe=commit&mergegroup=&groupSelect=groupByRepos&breakdown=false&tabOpen=true&tabType=authorship&tabAuthor=Halpfrog&tabRepo=AY2122S2-CS2103T-W14-1%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code&authorshipIsBinaryFileTypeChecked=false)


* **Project management**:
  * Approved and reviewed PR's for merging
  * Created issues for PR's to recommend changes
  * Worked with team members to resolve merge conflicts in a timely manner.


* **Enhancements to existing features**:
  * Added the ability to traverse previous commands [\#66](https://github.com/AY2122S2-CS2103T-W14-1/tp/pull/66)
  * Added the Book find command[\#110](https://github.com/AY2122S2-CS2103T-W14-1/tp/pull/110)
  * Added test cases for Book find[\#132](https://github.com/AY2122S2-CS2103T-W14-1/tp/pull/132)
  * Add test cases for previous commands[\#66](https://github.com/AY2122S2-CS2103T-W14-1/tp/pull/66)


* **Documentation**:
  * User Guide:
    * Add Book find and the previous Command feature to the User Guide[\#139](https://github.com/AY2122S2-CS2103T-W14-1/tp/pull/139)
    * Changes to how the Book find feature were updated in the User Guide[\$129](https://github.com/AY2122S2-CS2103T-W14-1/tp/pull/129)
    * Glossary updates for the User Guide[\#108](https://github.com/AY2122S2-CS2103T-W14-1/tp/pull/108)
  * Developer Guide:
    * Add use cases, NFR and Glossary to the DG[\#30](https://github.com/AY2122S2-CS2103T-W14-1/tp/pull/30) [\#144](https://github.com/AY2122S2-CS2103T-W14-1/tp/pull/144)
    * Add Book Find feature to the use cases in the DG[\#121](https://github.com/AY2122S2-CS2103T-W14-1/tp/pull/121)
    * Add line breaks throughout the DG to enable better conversion to a pdf[\#224](https://github.com/AY2122S2-CS2103T-W14-1/tp/pull/224)
    * Add in manual test cases and implementation details for Book find [\#214](https://github.com/AY2122S2-CS2103T-W14-1/tp/pull/214)

* **Review/mentoring contributions**:
  * PR reviewed (with non-trivial review comments): [\#138](https://github.com/AY2122S2-CS2103T-W14-1/tp/pull/138) [#116](https://github.com/AY2122S2-CS2103T-W14-1/tp/pull/138)

* **Community**:
  * Bugs reported for other team can be found [here](https://github.com/Halpfrog/ped/issues)


* **Tools**:
  * Gradle
  * Intellij
  * Assertions


