.data
m1: .asciiz "Enter the number 1: "
m2: .asciiz "Enter the number 2: "
m3: .asciiz "The sum is "

.text
.globl main

main:
    li $v0, 4
    la $a0, m1
    syscall

    li $v0, 5
    syscall

    move $t0, $v0
    
    li $v0, 4
    la $a0, m2
    syscall

    li $v0, 5
    syscall

    add $t0, $t0, $v0

    li $v0, 4
    la $a0, m3
    syscall

    li $v0, 1
    move $a0, $t0
    syscall

    li $v0, 10
    syscall