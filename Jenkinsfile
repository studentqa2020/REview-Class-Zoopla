pipeline{
agent any
  environment{
  maven MAVEN_HOME
  }

stages{
stage("Build"){
steps{
bat 'mvn clean install'
}

}

}
}
