pipeline{
agent any

stages{
stage("Build"){
steps{
bat '''set MAVEN_HOME =C:\\Program Files\\apache-maven-3.6.3
set path =C:\\Program Files\\apache-maven-3.6.3\\bin:%path%;
mvn clean install'''

}

}
}
