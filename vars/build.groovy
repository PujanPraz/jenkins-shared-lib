def call(String username, String projectName, String version, String path) {
    sh "docker build -t ${username}/${projectName}:${version} -f ${path}/Dockerfile ${path}"
}
