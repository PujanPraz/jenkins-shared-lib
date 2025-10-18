def call(String username, String projectName, String version){
  sh "docker build -t ${username}/${projectName}:${version} ."
}
