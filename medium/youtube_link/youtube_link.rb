"""
@author André Peralta
@version 20/05/2021
"""
def youtubeLinkRecorted link
	if link.index("=")
		return link[link.index("=")+1..link.length]
	else
		return link[link.index("e/")+2..link.length]
	end
end

puts "Link: "
link = gets
print youtubeLinkRecorted(link)
