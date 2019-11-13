function search() {
    var search = $("#searchResult");
    if($("#searchQuery").val().length >= 0){
        $.ajax(
            {
                url: "/dosearch",
                data: {"query": $("#searchQuery").val()},
                dataType: "json",
                success: function (msg) {
                    search.html("");
                    var table = "<table class=\"table text\" style=\"width: 70%\" align=\"center\"><tr><td>Activity</td><td>Description</td></tr>";
                    if(msg.objects.length > 0) {
                        for(var i=0; i<msg.objects.length; i++){
                            table += "<tr><td>" + msg.objects[i].name + "</td><td>" + msg.objects[i].description + "</td></tr>";
                        }
                        table += ("</table>");
                        search.append(table)
                    }
                }
            }
        )
    }
}