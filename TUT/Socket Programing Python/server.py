#!/usr/bin/env python3

import socket

HOST = '10.103.199.243'  # Standard loopback interface address (localhost)
PORT = 6000        # Port to listen on (non-privileged ports are > 1023)

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    s.bind((HOST, PORT))
    s.listen()
    conn, addr = s.accept()
    with conn:
        print('Connected by', addr)
        while True:
            data1 = conn.recv(1024)
            # print(data1)
            with open("NEWFILE", "r") as p:
                data = p.read()
                # conn.sendall(data1)
            conn.sendall(str.encode(data))
