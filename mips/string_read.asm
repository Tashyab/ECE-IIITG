.data
msg1: .asciiz "Enter the string: "
msg2: .asciiz "The entered the string is "
str: .space 128

.text
.globl main

main:
    li $v0, 4
    la $a0, msg1
    syscall

    li $v0, 8
    la $a0, str
    li $a1, 14
    syscall

    move $t0, $a0

    li $v0, 4
    la $a0, msg2
    syscall

    li $v0, 4
    move $a0, $t0
    syscall

    li $v0, 10
    syscall
    


     
