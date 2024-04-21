.data
msg: .asciiz "\nPalak and Bohra\n"
num: .word 4

.text

.globl main

main: li $v0, 1
	lw $a0, num
	syscall

	li $v0, 4
	la $a0, msg
	syscall

	li $v0, 10
	syscall
