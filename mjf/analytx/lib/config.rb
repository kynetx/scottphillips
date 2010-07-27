module ANALYTX
   module GlobalConfig
      def set(setting, val)
        raise "Set expects a symbol as it's first argument." unless setting.class == Symbol
        global_settings[environment][setting] = val
      end

      def configure(env, &block)
        @@environment = env
        global_settings[env] = {}
        yield
        return self
      end

      def environment
        @@environment ||= (ENV['RACK_ENV'] || :development).to_sym
        @@environment
      end

      def global_settings
        @@global_settings ||= {}
      end

   end

  
end
