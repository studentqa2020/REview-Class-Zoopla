pipeline{
agent any
  environment{
  mvn=MAVEN_HOME
  }

stages{
stage("Build"){
steps{
bat 'mvn clean install'
}

}

}
}
