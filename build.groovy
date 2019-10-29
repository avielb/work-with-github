properties([parameters([string(defaultValue: 'aviel', description: '', name: 'name', trim: false)]), pipelineTriggers([pollSCM('* * * * *')])])

node {
    stage("checkout repo"){
        checkout([$class: 'GitSCM', branches: [[name: '*/develop']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/avielb/work-with-github.git']]])
    }
    stage("hello world"){
        echo "Hello world!"
    }
}
