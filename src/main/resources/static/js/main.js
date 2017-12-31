function refresh() {
  $.ajax({
    url: "/api/data",
    success: function(data) {
      var svg = d3.select("svg");
      var circle = svg.selectAll("circle").data(jQuery.parseJSON(data));
      var circleEnter = circle.enter().append("circle")

      circle.attr("r", function(d) { return Math.sqrt(d); });

      circleEnter.attr("cy", 60);
      circleEnter.attr("cx", function(d, i) { return 40*i + 40; });
      circleEnter.attr("r", function(d) { return Math.sqrt(d); });
    }
  });
}