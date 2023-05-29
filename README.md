## Custom Yocto ##

- - - - 
### Installing required Linux packages ###
Please make sure your host PC is up to date and it should be running Ubuntu 18.04/20.04 64-bit: 
    
    $ sudo apt-get update
    
Then, install the following packages: 

    $ sudo apt-get install gawk wget git diffstat unzip texinfo gcc-multilib \
    build-essential chrpath socat cpio python3 python3-pip python3-pexpect \
    xz-utils debianutils iputils-ping libsdl1.2-dev xterm libyaml-dev libssl-dev \
    autoconf libtool libglib2.0-dev libarchive-dev sed cvs subversion coreutils \
    texi2html docbook-utils help2man make gcc g++ desktop-file-utils libgl1-mesa-dev \
    libglu1-mesa-dev mercurial automake groff curl lzop asciidoc u-boot-tools dos2unix \
    mtd-utils pv libncurses5 libncurses5-dev libncursesw5-dev libelf-dev zlib1g-dev bc \
    rename zstd libgnutls28-dev python3-git python python-pysqlite2 zstd liblz4-tool
     
### Git Config ###

    $ git config --global user.name "Your Name"
    $ git config --global user.email youremail@example.com
    
### Install git-repo ###    

    $ mkdir -p ~/bin
    $ curl https://commondatastorage.googleapis.com/git-repo-downloads/repo > ~/bin/repo
    $ chmod a+x ~/bin/repo
    $ export PATH=~/bin:$PATH
    
### Create a Directory for Nuand Yocto ###    

    $ mkdir yocto
    $ cd yocto

### Download Yocto Kirkstone ### 
Download the 5.15.71-2.2.0 release

    $ repo init -u https://github.com/busratuzcu/meta-test.git -b kirkstone -m kirkstone.xml
    $ repo sync
    
