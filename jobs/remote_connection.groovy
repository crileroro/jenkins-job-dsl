job('remote-connection-dsl'){
    steps{
        publishOverSsh{
            server('remote _host@remote_user:22')
        }
        remoteShell('remote_user@remote _host:22'){
            command('USER=$(whoami)', 'echo "This is $USER from $(hostname)"')
        }
    }

}