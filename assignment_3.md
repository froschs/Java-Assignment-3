#### Week 3 (Loops) Assignment
You will write a loop structure __while__ or __for__ that will reverse a string of your choosing.

This means you can get a string from the console using __Scanner__ or a predefined variable.

Example
```
"Welcome" => "emocleW"
```

Your string should be at least 5 characters long.

**Hint** _You will likely have to pull each character out of the string and then convert it from a character back into a String to accomplish this assignment. There is a method on String.**valueOf()** which accepts a character and returns a String for that character. There are other ways to do this but you can find the documentation inside your IDE to help learn how to use it._

You will submit this as a Pull Request to the repo WCCCEDU/CPT-163-27-F2015-Assignment-3-loops

##### Setup for Github
- Fork the repo to your personal account
- Clone your fork to your local computer
  - From Github Desktop
    - click the + on the top left
    - select clone then search for `CPT-163-27-F2015-Assignment-3-loops` use the one under the section with your github name
  - From Command Line
    - Copy the `https` link from your fork on github.com (its below the settings button on the right hand side of the page)
    - run `git clone <copied url>` (this will create a folder the same name as the repo in the directory you ran this command)
- Create a branch on your fork of the Assignment-2 Repo using the format <github-name>/<feature_description>
  - From Github Desktop
    - Click the `Add a Branch` button (It should be the button next to the dropdown that says `master`)
    - Make sure you create your branch from master
  - From Command Line
    - run `git checkout -b <branch_name>`
- In Netbeans create a new project and set the __Project Directory__ to the folder that was created when you cloned your fork.
- Write Code!
- Create a commit
  - From Github Desktop
    - Select your fork and fill-in the commit summary
    - Click `Sync`
  - From Command Line
    - run `git add .`
    - run `git commit -m "<your commit message>"`
    - run `git push origin <your_branch_name>`
- Go to Github.com and open your PR by clicking on `Compare and Open Pull Request`
