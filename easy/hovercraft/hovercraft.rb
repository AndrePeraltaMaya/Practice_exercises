"""
@author	André Peralta
@version 20/05/2021
"""

def profits sales 

	insurance = -1000000
	profit = 3000000 * sales
	cost = -10*2000000

	final_profit = insurance+cost+profit

	if final_profit > 0
		return "Profit"
	elsif final_profit < 0
		return "Loss"
	elsif final_profit == 0
		return "Broke Even"
		
	end
end


puts "Sales: "
sales = gets.to_i

print profits(sales)

