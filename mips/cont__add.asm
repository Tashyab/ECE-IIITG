.data  
    m1: .asciiz "The sum is "
    num: .word 12, 23, 0

.text

.globl main

main:
    la $t0, num

    lw $t1, 0($t0)
    lw $t2, 4($t0)

    add $t1, $t1, $t2
    sw $t1, 8($t0)

    li $v0, 4
    la $a0, m1
    syscall

    li $v0, 1
    move $a0, $t1
    syscall

    li $v0, 10
    syscall


