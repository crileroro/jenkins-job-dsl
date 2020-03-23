job('remote-connection-dsl'){
    steps{
        remoteShell('remote_user@remote _host:22'){
            command('USER=$(whoami)', 'echo "This is $USER from $(hostname)"')
        }
    }

}