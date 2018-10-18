#/bin/sh

# Check if our github project is set up
response=$(curl --write-out %{http_code} --silent --output /dev/null https://github.com/npiper/${artifactId})

# Check status code
if [[ "$status_code" -ne 200 ]] ; then
  echo "${projectName} repository has not been created"
  exit 1;
fi

# Initialise repository
git init
git add . && git commit -am "initial commit"
git remote add origin https://github.com/npiper/${artifactId}.git
git push origin

# Create 'develop' branch & push to repo
git branch develop
git checkout develop
git add .
git commit -m "adding a change from the develop branch"
git checkout master
git push origin develop

# create gh-pages branch
git checkout --orphan gh-pages
git rm -rf .
touch README.md
git add README.md
git commit -m 'initial gh-pages commit'
git push origin gh-pages