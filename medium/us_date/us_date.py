def us_date(date):

	if date.find('/') != -1:

		date_list = date.split('/')
		print(date_list[1] + '/' + date_list[0] + '/' + date_list[2])

	else:
		months = {'January': '1',
		'February': '2',
		'March': '3',
		'April': '4',
		'May': '5',
		'June': '6',
		'July': '7',
		'August': '8',
		'September': '9',
		'October': '10',
		'November': '11',
		'December': '12'}

		date_list = date.split(' ')

		date_list[0] = months[date_list[0]]

		date_list[1] = date_list[1].split(',')

		print(date_list[1][0] + '/' + date_list[0] + '/' + date_list[1][1])

date = input()

us_date(date)
