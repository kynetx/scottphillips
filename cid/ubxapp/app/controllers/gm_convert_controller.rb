class ApiOneController < ActionController::Metal
  def convert
      gm_script = params[:gm_script]

      header = gm_script.split("==/UserScript==")[0];

      meta_data = {};
      data.each_line do |data|
        results = data.match(/@([a-z]+)(.*)/);
        if (results)
          meta_data[results[1]] = results[2].strip();
        end
      end

      puts("ruleset axxxxxx {")

      puts("meta {")

      meta_data.each_pair do |key,value|
        if(key == "name")
          puts('name "'+ value + '"' )
        end
        if(key == "description")
          puts('description <<'+ description + '>>' )
        end
        if(key == "contributor")
          puts('author "'+ value + '"' )
        end
      end

      puts("}")

      javascript = gm_script.split("==/UserScript==")[1];
  end
end