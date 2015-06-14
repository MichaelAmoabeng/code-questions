# Project Structure
The structure of this project has a separate namespace for each chapter and sub namespaces for each question. This 
allows you to create sub classes for some questions and keep a structure of where these classes belong. 

# Maven
[Run Maven](https://maven.apache.org/run-maven/index.html)
[What is the Pom] (https://maven.apache.org/pom.html#What_is_the_POM) Good read but don't worry if confusing and not 
important right now. 
[Maven Lifecycle] (https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html) This is pretty 
important so I would take some time. Essentially it shows when everything happens in the build. It becomes important 
when you start adding plugins. 
[Maven Project Structure] (https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout
.html) Quick read that helps explain the structure of this project.

# JUNIT
[Junit] (http://junit.org/) is the test framework. This link has several good articles. Don't worry about 
installation because that is already handled by maven. All you need to learn is how to create a code file with unit 
tests in them. 
 
# Git Ignore
You will now notice a .gitignore file. All files, folders, patterns will be ommitted from version control. This is 
necessary because items like build artifacts that change every build do not need to be checked in. For various 
projects you can find standard ignore files. 


