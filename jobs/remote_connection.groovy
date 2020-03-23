job('remote-connection-dsl'){
    discardOldBuilds(-1, 3)
    steps{
        remoteShell('remote_user@remote_host:22'){
            command('USER=$(whoami)', 'echo "This is $USER from $hostname"')
        }
    }

}