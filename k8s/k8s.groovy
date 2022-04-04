pipelineJob('k8s infastructure') {
  definition {
    cpsScm {
      git branch: 'ipcrm/jenkins', url: 'https://github.com/lacework-dev/detc-resources.git'
    }
    scriptPath('jenkinsfiles/k8s/Jenkinsfile')
  }
}

