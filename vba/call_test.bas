sub main()
	
	Debug.Print col!no2
	
	a 1,2,3
	a.b 1,2
	a.b!c.d 1,2
	
	call a(1,2,3)
	
	a = f(1,3)
	a = a.b
	a = a.b(1)
	a = a!b.t(2)
	
	abc = fun(1,2)(2).c(22)(33).d!a.t
	
	call a
	call a(1,2,3)()
	a 2,3,4
	a
	
end sub