# download git cli (1 time task)
download this:

https://git-scm.com/downloads

complete install, then try opening cmd and type:

```bash
git
```

if it works, good, you have git installed 

# Download the repository to your computer (1 time task)

first, you **MUST** create new folder, it will be project folder, create it maybe at desktop or whatever, then open cmd at it

~*ask layan how to open cmd at specific file*

then to clone project, type:

```bash
git clone https://github.com/Wouze/Java-Project
```

this may ask for login keys, then it will make new folder named `Java-Project`, inside it will be all of the source code

to enter the file, do:

```bash
cd Java-Project
```
Now you are inside the folder and you can do `git` commands

# Explain some git commands
the most important commands of git are:
```bash
git status
git add
git commit
git pull
git push
```

each comes with diffrent useage
# git status
this gives basic info about current work

![image](https://github.com/Wouze/Java-Project/assets/78015958/03f5a8da-91cc-41f7-b537-295ebf40142a)

this will tell you changed files, modified, and more, like this:
![image](https://github.com/Wouze/Java-Project/assets/78015958/e016e3b3-a649-494a-b4ee-f48097a49d44)


# git add
This one used so much, it will add the changes to the **local** git repo, and it usually used like this:
```bash
git add .
```
this will add all changes

# git commit
This also used so much, it saves all changes that have been done. Used like this:
```bash
git commit -m "<enter here any message explain changes>"
```
the message will appear at the git repo like this:
![image](https://github.com/Wouze/Java-Project/assets/78015958/68d757f1-7f22-46b9-9b6c-e204f32ea5b9)

# git pull && push
Those 2 commands are used to sync and update with git to cloud, needs internet connection to do
```bash
git push
```
Push mean push all current changes from local repo to could repo, aka changes will be here https://github.com/Wouze/Java-Project/
```bash
git pull
```
this will pull all changes from could to local git, very important to do always

# Normal work-flow
you should at the very very first thing open the folder, and open cmd at the project folder, then do `git status` to check you are good to go or not

then if good, type `git pull` to make your files up to date with the cloud version, then start working and changing files

after working, you should do `git add .` and `git commit -m "<any message>"` to save changes and commit them

then, if you want to upload the changes to cloud and want other members to check your changes, type `git push`

this might cause some **conflict** to the code, and can be fixed easily

# some things I might missed
You might get some messages from git asks for typing some commands, you should do them or search google about them

this help file doesn't explain all things
