job('remote-connection-dsl'){
    publishers {
        publishBuild {
            discardOldBuilds(-1, 3)
        }
    }
    steps{
        remoteShell('remote_user@remote _host:22'){
            command('USER=$(whoami)', 'echo "This is $USER from $hostname"')
        }
    }

}