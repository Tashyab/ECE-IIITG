.data
n: .word 0
msg1: .asciiz "Enter a number: "
msg2: .asciiz "The factorial is "
prod: .word 1

.text
.globl main

main:
    li $v0, 4
    la $a0, msg1
    syscall

    li $v0, 5
    syscall

    move $t0, $v0

    lw $t1, prod

loop: 
    bgt $t0, 0, exit
    mult $t0, $t1
    
