# angular-example
This is an example project for the "HACK" event

## Project Creation Details

steps followed to create this outline:

using github's verbose doodle tech things like Node.js and npm are installed by default for convience. So we can start using those tools now.

1) this step installs the command line interface for angular projects
 ```
 npm install -g @angular/cli
 ```
2) use the cli command "ng" to crete a base project in this case we are calling it "app" for simplicity

```
ng new app
```

3) follow interactive cli tool to set features as wanted/needed

a) Would you like to enable autocompletion? This will set up your terminal so pressing TAB while typing Angular CLI commands will show possible options and autocomplete arguments. (Enabling autocompletion will modify 
configuration files in your home directory.) (Y/n) 

Y -> "Yes, Seems like a nice tool"

b) Would you like to share pseudonymous usage data about this project with the Angular Team
at Google under Google's Privacy Policy at https://policies.google.com/privacy. For more
details and how to change this setting, see https://angular.io/analytics. (y/N)

N -> "No, i'm not helping 'the man' watch us!! This is sarcasm but i did select no just because sharing data is an extra process and we want a 'lite' solution"

c) Would you like to add Angular routing? (y/N) 

Y -> "heck ya! love angular routing!"


d) Which stylesheet format would you like to use? css, scss, sass, less

 SCSS -> "This gives us the ability to leverage regular css and additional features if we want"

 Confused? Same. read these tho -> https://www.geeksforgeeks.org/what-is-the-difference-between-css-and-scss/  https://www.geeksforgeeks.org/what-is-the-difference-between-scss-and-sass/?ref=lbp

and bam! a base application is set up and ready for use to play with!

## //TODO
From here we can add addtional packages and features as follows:

//TODO
Basic Navigation bars using angular materials and angular routing

//TODO
Data Services using subjects and observables for a component/service model

//TODO If possible -> 
Node library for database calls directly without a backend API

# HOW TO START

Locally (on your computer or dev env) you'll need the following tools:
1) A text editor or IDE (I use vscode but whatever is perfect)
2) git and a github.com account (see Do I have git? section below)
3) Node.Js and NPM (see Node.JS and NPM section below)

Clone the repo at https://github.com/ztrnr/angular-example.git

navigate into angular directory:
```
cd app
```
get project node modules by running: 
```
npm i
```
serve project via localhost and port 4200:
```
ng serve
```
  * keeping this terminal open with ng serve running allows angular to hot-load changes to your code
  * for this reason i recommend a second terminal for additional commands needing during dev work (like ng, npm, or git commands)

## Node.Js and NPM

in a terminal or command prompt window type:
```
node -v
```
NOTE: be sure to have at least v16

in a terminal or command prompt window type:
```
npm -v
```
NOTE: be sure to have at least v8.19.2

If these returns a value you have node and can utilize their packages for angular development.

If not download you'll need to download them.

go here for downloads: https://nodejs.org/en/download/
Note: npm will likely be packaged in your nodejs download

I highly recommend using a node version manager for installation and download managment. NVM makes upgrading/downgrading these tools very easy. read more on this here: https://docs.npmjs.com/downloading-and-installing-node-js-and-npm#using-a-node-version-manager-to-install-nodejs-and-npm



## Do I have git? 

in a terminal or command prompt window type: 
```
git --version
```
if this returns a value you have git. this will enable you to use version contorl in conjuction with a github.com account

to set up your local git cli with your github.com credentials you can follow this link: https://docs.github.com/en/get-started/getting-started-with-git/caching-your-github-credentials-in-git

since you have git and your credientials setup send me your github.com account email/username to be added as a contributor to the project @ zturner@genesco.com

## Workflow

After you are added as a collaborator you can clone this repository by typing in:

git clone https://github.com/ztrnr/angular-example.git

We will follow a simple workflow as follows:

when making a changes follow these guidelines:

for new additions branch off MAIN. Make your changes and commit often to your branch. Once your changes are done create a pull request to merge your branch back into MAIN. Keep branch work focused to one main task such that a branch's lifetime is very short. 

PR's will require 2 approvals before merging and we can delete the branch after successfull merge. Any contributor can approve a PR.

when working locally always pull from origin to start.

when working in a branch always make sure your not BEHIND on commits in MAIN.

if you want something different or a change to this workflow let me know.

*if you don't have git see Installing Git on Windows below for directions


# Tomcat Server 

Install tomcat server from here: https://tomcat.apache.org/download-10.cgi#10.1.4

Set up documentation: https://tomcat.apache.org/tomcat-10.1-doc/setup.html

add or edit CATALINA_HOME/config/server.xml with proper configurations and database connections.

move angular-example/app/dist/app into CATALINA_HOME/webapps/

go to url defined in server.xml to use deployed angular app

for server runtime dependencies like database drivers go ahead and just drop them into CATALINA_HOME/lib/
preferably a jar that specifies a version number in the title. I like using https://mvnrepository.com/ for this because the registry allows me to see who is providing the package, last update dates, vulnerabilities, and provides an easy download link.

other dependencies should be packaged with their project structure.

# Installing Git on Windows

A quick overview for the git installation tool on windows

* select 32 or 64 bit depending on system. Select standalone.
* Go here for git download https://git-scm.com/downloads/
* Make sure download into a drive that you have admin rights for
  * this will make it very easy to upgrade or downgrade as needed
  * this will most likely be the second step during installation window after accepting the license agreement
* for installation options "Select Components"
  * you may want to select search windows for daily updates (which will work since its in your D drive)
* for "adjusting the name of the initial branch in new repositories"
  * Select "Override the default ..."
  * type in "dev" in all lower cases
  * this feature will only be used when created repos on your local machine.
* for "Adjusting your PATH environment"
  * select "Get from command line and also from 3rd-pary software"
  * this will enable github windows and your IDEs to utilitze git
* use whatever for ssh executable 
  * we recommend the bundled OpenSSH
* for https transport use OpenSSL library
* make sure to select git config --global core.autocrlf false
* utilize windows default cmd
* utilize default for git pull behavior
* you can use git credential manager as default
  * this is secured through cryptography idk what algorithm
* don't enable symbolic links
* and enable caching for faster operations
* don't opt in for new psuedo features
* after all these options you may click install
