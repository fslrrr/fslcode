#!/usr/bin/python
import paramiko
import threading

def sshcommond(server,comm):
	ip = server[0]
	user = server[1]
	passwd = server[2]
	ssh = paramiko.SSHClient()
	ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
	ssh.connect(ip,22,user,passwd)
	stdin, stdout, stderr = ssh.exec_command(comm)
	out = stdout.readlines()
	for o in out:
		print ip+o
	ssh.close()

if __name__ == '__main__':
	threads = []
	f = open('ip.list')
	l = f.readlines()
	for x in l:
		x in l:
			x = x.strip('\')
			l2 = x.split(' ')
	    t = threading.Thread(target=sshcommond,args=(l2,'uptime'))
	    t.start()
	f.close()