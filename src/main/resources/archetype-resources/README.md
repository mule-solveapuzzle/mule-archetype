# Setting up your project

## Pre-Requisites

### Accounts

 * Github
 * Travis-ci
 * AWS S3 Repo and user access keys

### Software 

 * Travis CI CLI
 * Git CLI
 * Maven

## Add encrypted variables to Travis.yml

```
travis encrypt AWS_ACCESS_KEY_ID=[Your_AWS_Access_Key] --add
travis encrypt AWS_SECRET_KEY=[Your_AWS_Secret_Key] --add
travis encrypt GIT_USER_NAME=[Your github user name] --add
travis encrypt GITPW=[Your GIT OAuth] --add
```

## Initialise Github Repo and the branches -  master, develop, gh-pages

Make sure your local git environment user is configured as per the [First time Git Setup guide](https://git-scm.com/book/en/v2/Getting-Started-First-Time-Git-Setup)

Create an initial github repository with the same name as the `artifactId` you created the project with.

Run the gitsetup.sh script.

```
./gitsetup.sh
```

