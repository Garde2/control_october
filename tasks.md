control work

Информация о проекте
Необходимо организовать систему учета для питомника в котором живут
домашние и вьючные животные

Задание
1. Используя команду cat в терминале операционной системы Linux, создать
два файла Домашние животные (заполнив файл собаками, кошками,
хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
ослы), а затем объединить их. Просмотреть содержимое созданного файла.
Переименовать файл, дав ему новое имя (Друзья человека).
2. Создать директорию, переместить файл туда

Здесь же история команд
–
garde@garde-VirtualBox:~$ sudo su
[sudo] пароль для garde:
root@garde-VirtualBox:/home/garde# mkdir CountAnimals
root@garde-VirtualBox:/home/garde# cd CountAnimals
root@garde-VirtualBox:/home/garde/CountAnimals# cat > homeAnimals
dog
cat
hamster
mouse
cow
sheep
pork
\
root@garde-VirtualBox:/home/garde/CountAnimals# cat > packAnimals
camel
horse
mule
ox
root@garde-VirtualBox:/home/garde/CountAnimals# cat homeAnimals packAnimals > animals
root@garde-VirtualBox:/home/garde/CountAnimals# cat animals
dog
cat
hamster
mouse
cow
sheep
pork
\
camel
horse
mule
ox
root@garde-VirtualBox:/home/garde/CountAnimals# mv animals manFriends
root@garde-VirtualBox:/home/garde/CountAnimals# ls -ali
итого 20
1573111 drwxr-xr-x  2 root  root  4096 окт  3 22:14 .
1572867 drwxr-x--- 15 garde garde 4096 окт  3 22:09 ..
1573120 -rw-r--r--  1 root  root	39 окт  3 22:11 homeAnimals
1573138 -rw-r--r--  1 root  root	59 окт  3 22:13 manFriends
1573122 -rw-r--r--  1 root  root	20 окт  3 22:13 packAnimals
root@garde-VirtualBox:/home/garde/CountAnimals#

–

root@garde-VirtualBox:/home/garde/CountAnimals# sudo wget https://dev.mysql.com/get/mysql-apt-config_0.8.23-1_all.deb
--2023-10-03 22:24:02--  https://dev.mysql.com/get/mysql-apt-config_0.8.23-1_all.deb
Распознаётся dev.mysql.com (dev.mysql.com)… 184.51.238.43, 2001:2030:4e:8e::2e31, 2001:2030:4e:9c::2e31
Подключение к dev.mysql.com (dev.mysql.com)|184.51.238.43|:443... соединение установлено.
HTTP-запрос отправлен. Ожидание ответа… 302 Moved Temporarily
Адрес: https://repo.mysql.com//mysql-apt-config_0.8.23-1_all.deb [переход]
--2023-10-03 22:24:03--  https://repo.mysql.com//mysql-apt-config_0.8.23-1_all.deb
Распознаётся repo.mysql.com (repo.mysql.com)… 2.22.239.224, 2a02:26f0:9500:b83::1d68, 2a02:26f0:9500:b8a::1d68
Подключение к repo.mysql.com (repo.mysql.com)|2.22.239.224|:443... соединение установлено.
HTTP-запрос отправлен. Ожидание ответа… 200 OK
Длина: 18028 (18K) [application/x-debian-package]
Сохранение в: ‘mysql-apt-config_0.8.23-1_all.deb’

mysql-apt-config_0.8.23-1_all.de 100%[==========================================================>]  17,61K  --.-KB/s	за 0s 	 

2023-10-03 22:24:03 (233 MB/s) - ‘mysql-apt-config_0.8.23-1_all.deb’ сохранён [18028/18028]

root@garde-VirtualBox:/home/garde/CountAnimals# sudo dpkg -i mysql-apt-config_0.8.23-1_all.deb
Выбор ранее не выбранного пакета mysql-apt-config.
(Чтение базы данных … на данный момент установлено 180068 файлов и каталогов.)
Подготовка к распаковке mysql-apt-config_0.8.23-1_all.deb …
Распаковывается mysql-apt-config (0.8.23-1) …
Настраивается пакет mysql-apt-config (0.8.23-1) …
Warning: apt-key should not be used in scripts (called from postinst maintainerscript of the package mysql-apt-config)
Warning: apt-key is deprecated. Manage keyring files in trusted.gpg.d instead (see apt-key(8)).
OK
root@garde-VirtualBox:/home/garde/CountAnimals#


root@garde-VirtualBox:/home/garde/CountAnimals# apt-get update
Сущ:1 http://ru.archive.ubuntu.com/ubuntu jammy InRelease
Пол:2 http://ru.archive.ubuntu.com/ubuntu jammy-updates InRelease [119 kB]                                                    	 
Пол:3 http://ru.archive.ubuntu.com/ubuntu jammy-backports InRelease [109 kB]                                                  	 
Пол:4 http://repo.mysql.com/apt/ubuntu jammy InRelease [20,3 kB]                                                              	 
Пол:5 http://security.ubuntu.com/ubuntu jammy-security InRelease [110 kB]                                                     	 
Пол:6 https://download.docker.com/linux/ubuntu jammy InRelease [48,9 kB]                                            	 
Пол:7 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 Packages [1 022 kB]   	 
Пол:8 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main i386 Packages [497 kB]
Пол:9 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main Translation-en [229 kB]
Пол:10 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 DEP-11 Metadata [101 kB]
Пол:11 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 c-n-f Metadata [15,6 kB]



root@garde-VirtualBox:/home/garde/CountAnimals# apt-get install mysql-server

root@garde-VirtualBox:/home/garde/CountAnimals# sudo wget https://download.docker.com/linux/ubuntu/dists/jammy/pool/stable/amd64/docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb
--2023-10-03 22:50:45--  https://download.docker.com/linux/ubuntu/dists/jammy/pool/stable/amd64/docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb
Распознаётся download.docker.com (download.docker.com)… 65.9.55.48, 65.9.55.127, 65.9.55.95, ...
Подключение к download.docker.com (download.docker.com)|65.9.55.48|:443... соединение установлено.
HTTP-запрос отправлен. Ожидание ответа… 200 OK
Длина: 40955778 (39M) [binary/octet-stream]
Сохранение в: ‘docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb’

docker-ce-cli_20.10.13~3-0~ubunt 100%[==========================================================>]  39,06M  11,2MB/s	за 3,5s    

2023-10-03 22:50:49 (11,2 MB/s) - ‘docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb’ сохранён [40955778/40955778]

root@garde-VirtualBox:/home/garde/CountAnimals#
root@garde-VirtualBox:/home/garde/CountAnimals# sudo dpkg -i docker-ce-cli_20.10.13~3-0~ubuntu_amd64.deb
root@garde-VirtualBox:/home/garde/CountAnimals# sudo dpkg -r docker-ce
root@garde-VirtualBox:/home/garde/CountAnimals# sudo dpkg -i docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb
root@garde-VirtualBox:/home/garde/CountAnimals# sudo dpkg -r docker-ce-cli
root@garde-VirtualBox:/home/garde/CountAnimals# 

