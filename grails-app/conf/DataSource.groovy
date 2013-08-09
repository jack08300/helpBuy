dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    username = "my"
    password = "W8RRSSS2EI09 "
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:mysql://my-outfit.com/my_outfit?useUnicode=yes&characterEncloding=UTF-8"
            username = "my"
            password = "W8RRSSS2EI09 "
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://my-outfit.com/my_outfit?useUnicode=yes&characterEncloding=UTF-8"
            username = "my"
            password = "W8RRSSS2EI09 "
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://my-outfit.com/my_outfit?useUnicode=yes&characterEncloding=UTF-8"
            username = "my"
            password = "W8RRSSS2EI09 "
            pooled = true
            properties {
               maxActive = -1
               minEvictableIdleTimeMillis=1800000
               timeBetweenEvictionRunsMillis=1800000
               numTestsPerEvictionRun=3
               testOnBorrow=true
               testWhileIdle=true
               testOnReturn=true
               validationQuery="SELECT 1"
            }
        }
    }
}
