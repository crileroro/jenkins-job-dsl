job('remote-connection-dsl'){
    discardOldBuilds{
        numToKeep(3)
    }
    steps{
        remoteShell('remote_user@remote _host:22'){
            command('USER=$(whoami)', 'echo "This is $USER from $hostname"')
        }
    }

}