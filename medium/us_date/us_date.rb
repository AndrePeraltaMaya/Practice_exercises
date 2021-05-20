"""
@author	André Peralta
@version 20/05/2021
"""

def USdate date

	months = {'January'=> '1',
		'February'=> '2',
		'March'=> '3',
		'April'=> '4',
		'May'=> '5',
		'June'=> '6',
		'July'=> '7',
		'August'=> '8',
		'September'=> '9',
		'October'=> '10',
		'November'=> '11',
		'December'=> '12'}

	if date.index("/")
		dateList = date.split("/")
		return dateList[1] + "/" + dateList[0] + "/" + dateList[2]
	else
		dateList = date.split(" ")
		return dateList[1][0] + "/" + months[dateList[0]] + "/" + dateList[2]

	end
end


puts "Date: "
date = gets

print USdate(date)

