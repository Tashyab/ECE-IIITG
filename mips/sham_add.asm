.data
    m1: .asciiz "Enter a number: "
    m2: .asciiz "Enter another number: "
    m3: .asciiz "The sum is "
    # num: .word 12, 23

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

    move $t1, $v0

    add $t0, $t0, $t1

    li $v0, 1
    move $a0, $t0
    syscall

    li $v0, 10
    syscall




    