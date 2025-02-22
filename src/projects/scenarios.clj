(ns projects.scenarios)

(def busRoutes00
  '{
    :liverpool ( {:location "warrington" :cost 2} {:location "manchester" :cost 7} {:location "chester" :cost 4})
    })

(def busRoutes01
  '{ :newcastle ({:location "middlesbrough" :cost 8} {:location "darlington" :cost 7} {:location "durham" :cost 6})
    :middlesbrough ({:location "redcar" :cost 2} {:location "hartlepool" :cost 2} {:location "northallerton" :cost 3} {:location "newcastle" :cost 5} {:location "leeds" :cost 5})
    })

(def busRoutes02
  '{
    :york ( {:location "darlington" :cost 2} {:location "manchester" :cost 6} {:location "newcastle" :cost 4} {:location "durham" :cost 3})
    :darlington ({:location "newcastle" :cost 6} {:location "middlesbrough" :cost 3} {:location "durham" :cost 4} {:location "northallerton" :cost 2} {:location "leeds" :cost 17})

    })


(def busRoutes03
  '{
    :darlington ({:location "newcastle" :cost 6} {:location "middlesbrough" :cost 3} {:location "durham" :cost 4} {:location "northallerton" :cost 2} {:location "leeds" :cost 17})
    :leeds ({:location "manchester" :cost 18} {:location "york" :cost 6} {:location "wakefield" :cost 3})
    :manchester ({:location "liverpool" :cost 19} {:location "warrington" :cost 3} {:location "bolton" :cost 4})
    })

(def busRoutes04
  '{
    :york ( {:location "darlington" :cost 2} {:location "manchester" :cost 6}  {:location "leeds" :cost 2} {:location "newcastle" :cost 4} {:location "durham" :cost 3})
    :leeds ({:location "manchester" :cost 18} {:location "york" :cost 6} {:location "wakefield" :cost 3})
    :manchester ({:location "liverpool" :cost 19} {:location "warrington" :cost 3} {:location "leeds" :cost 2} {:location "bolton" :cost 4})
    })

(def busRoutes05
  '{
    :liverpool ( {:location "warrington" :cost 2} {:location "manchester" :cost 7} {:location "chester" :cost 4})
    :manchester ({:location "liverpool" :cost 19} {:location "warrington" :cost 3} {:location "leeds" :cost 2} {:location "bolton" :cost 4})
    :leeds ({:location "manchester" :cost 18} {:location "york" :cost 6} {:location "wakefield" :cost 3})
    :york ( {:location "darlington" :cost 2} {:location "manchester" :cost 6}  {:location "leeds" :cost 2} {:location "newcastle" :cost 4} {:location "durham" :cost 3})
    })



(def busRoutes06
  '{
    :newcastle ({:location "middlesbrough" :cost 8} {:location "darlington" :cost 7} {:location "durham" :cost 6})
    :middlesbrough ({:location "redcar" :cost 2} {:location "hartlepool" :cost 2} {:location "northallerton" :cost 3} {:location "newcastle" :cost 5} {:location "leeds" :cost 5})
    :leeds ({:location "manchester" :cost 18} {:location "york" :cost 6} {:location "wakefield" :cost 3})
    :manchester ({:location "liverpool" :cost 19} {:location "warrington" :cost 3} {:location "bolton" :cost 4})
    :liverpool ( {:location "warrington" :cost 2} {:location "manchester" :cost 7} {:location "chester" :cost 4})
    })


(def busRoutes07
  '{
    :liverpool ( {:location "warrington" :cost 2} {:location "manchester" :cost 7} {:location "chester" :cost 4})
    :manchester ({:location "liverpool" :cost 19} {:location "warrington" :cost 3} {:location "leeds" :cost 2} {:location "bolton" :cost 4})
    :leeds ( {:location "york" :cost 6} {:location "wakefield" :cost 3})
    :york ( {:location "darlington" :cost 2} {:location "manchester" :cost 6}  {:location "leeds" :cost 2} {:location "newcastle" :cost 4} {:location "durham" :cost 3})
    :darlington ({:location "newcastle" :cost 6} {:location "middlesbrough" :cost 3} {:location "durham" :cost 4} {:location "northallerton" :cost 2} {:location "leeds" :cost 17})

    })


(def busRoutes08
  '{ :newcastle ({:location "middlesbrough" :cost 8} {:location "darlington" :cost 7} {:location "durham" :cost 6})
    :middlesbrough ({:location "redcar" :cost 2} {:location "hartlepool" :cost 2} {:location "northallerton" :cost 3} {:location "newcastle" :cost 5} {:location "leeds" :cost 5})
    :darlington ({:location "newcastle" :cost 6} {:location "middlesbrough" :cost 3} {:location "durham" :cost 4} {:location "northallerton" :cost 2} {:location "leeds" :cost 17})
    :durham ({:location "darlington" :cost 3} {:location "newcastle" :cost 6})
    :northallerton ({:location "durham" :cost 4} {:location "darlington" :cost 5})
    :leeds ({:location "manchester" :cost 18} {:location "york" :cost 6} {:location "wakefield" :cost 3})
    :manchester ({:location "liverpool" :cost 19} {:location "warrington" :cost 3} {:location "bolton" :cost 4})
    :liverpool ( {:location "warrington" :cost 2} {:location "manchester" :cost 7} {:location "chester" :cost 4})
    })

(def busRoutes09
  '{
    :newcastle ({:location "middlesbrough" :cost 8} {:location "darlington" :cost 7} {:location "durham" :cost 6})
    :durham ({:location "darlington" :cost 3} {:location "newcastle" :cost 6})
    :darlington ({:location "newcastle" :cost 6} {:location "middlesbrough" :cost 3} {:location "durham" :cost 4} {:location "northallerton" :cost 2} {:location "leeds" :cost 17})
    :middlesbrough ({:location "redcar" :cost 2} {:location "hartlepool" :cost 2} {:location "northallerton" :cost 3} {:location "newcastle" :cost 5} {:location "leeds" :cost 5})
    :leeds ({:location "manchester" :cost 18} {:location "york" :cost 6} {:location "wakefield" :cost 3})
    :york ( {:location "darlington" :cost 2} {:location "manchester" :cost 6}  {:location "leeds" :cost 2} {:location "newcastle" :cost 4} {:location "durham" :cost 3})
    :manchester ({:location "liverpool" :cost 19} {:location "warrington" :cost 3} {:location "leeds" :cost 2} {:location "bolton" :cost 4})
    :liverpool ( {:location "warrington" :cost 2} {:location "manchester" :cost 7} {:location "chester" :cost 4})

    })
(def busRoutes10
  '{ :newcastle ({:location "middlesbrough" :cost 8} {:location "darlington" :cost 7} {:location "durham" :cost 6})
    :middlesbrough ({:location "redcar" :cost 2} {:location "hartlepool" :cost 2} {:location "northallerton" :cost 3} {:location "newcastle" :cost 5} {:location "leeds" :cost 5})
    :darlington ({:location "newcastle" :cost 6} {:location "middlesbrough" :cost 3} {:location "durham" :cost 4} {:location "northallerton" :cost 2} {:location "leeds" :cost 17})
    :durham ({:location "darlington" :cost 3} {:location "newcastle" :cost 6})
    :northallerton ({:location "durham" :cost 4} {:location "darlington" :cost 5})
    :york ( {:location "darlington" :cost 2} {:location "manchester" :cost 6}  {:location "leeds" :cost 2} {:location "newcastle" :cost 4} {:location "durham" :cost 3})
    :leeds ({:location "manchester" :cost 18} {:location "york" :cost 6} {:location "wakefield" :cost 3})
    :wakefield ({:location "liverpool" :cost 19} {:location "warrington" :cost 3} {:location "bolton" :cost 4} {:location "leeds" :cost 6})
    :manchester ({:location "liverpool" :cost 19} {:location "warrington" :cost 3} {:location "bolton" :cost 4})
    :liverpool ( {:location "warrington" :cost 2} {:location "manchester" :cost 7} {:location "chester" :cost 4})
    })
(def busRoutes11
  '{
      :newcastle ({:location "middlesbrough" :cost 8} {:location "darlington" :cost 7} {:location "durham" :cost 6} {:location "sunderland" :cost 4} )
      :sunderland ({:location "darlington" :cost 5} {:location "newcastle" :cost 3} {:location "durham" :cost 4}    )
      :durham ({:location "darlington" :cost 3} {:location "newcastle" :cost 6} {:location "durham" :cost 4}   {:location "chesterlestreet" :cost 4} )
      :chesterlestreet   ({:location "darlington" :cost 3} {:location "newcastle" :cost 6})
      :middlesbrough ({:location "redcar" :cost 2} {:location "hartlepool" :cost 2}  {:location "thornaby" :cost 1}{:location "northallerton" :cost 3} {:location "newcastle" :cost 5} {:location "york" :cost 7} {:location "saltburn" :cost 3})
      :saltburn ({:location "middlesbrough" :cost 3} {:location "whitby" :cost 2})
      :redcar ({:location "middlesbrough" :cost 3} {:location "saltburn" :cost 2} {:location "whitby" :cost 4})
      :thornaby ({:location "middlesbrough" :cost 1} {:location "stockton" :cost 1} {:location "yarm" :cost 3} {:location "saltburn" :cost 6} )
      :stockton ({:location "middlesbrough" :cost 1} {:location "thornaby" :cost 1} {:location "yarm" :cost 4} )
      :hartlepool ({:location "middlesbrough" :cost 3} {:location "whitby" :cost 6} {:location "saltburn" :cost 6} )
      :darlington ({:location "newcastle" :cost 6} {:location "middlesbrough" :cost 3} {:location "durham" :cost 4} {:location "northallerton" :cost 2} {:location "leeds" :cost 17})
      :northallerton ({:location "darlington" :cost 3} {:location "newcastle" :cost 6} {:location "thirsk" :cost 1})
      :thirsk ({:location "northallerton" :cost 1} {:location "york" :cost 3} {:location "yarm" :cost 4})
      :yarm  ({:location "northallerton" :cost 4} {:location "york" :cost 6} {:location "thirsk" :cost 5})
      :york ( {:location "darlington" :cost 2}{:location "castleford" :cost 5} {:location "preston" :cost 15} {:location "scarborough" :cost 6}  {:location "manchester" :cost 6}  {:location "leeds" :cost 2} {:location "newcastle" :cost 4} {:location "durham" :cost 3} {:location "harrogate" :cost 2}{:location "doncaster" :cost 5})
      :castleford ({:location "leeds" :cost 3} {:location "wakefield" :cost 2})
      :scarborough ({:location "leeds" :cost 10} {:location "york" :cost 5} {:location "whitby" :cost 1} {:location "helmsley" :cost 2})
      :helmsley  ({:location "whitby" :cost 4} {:location "york" :cost 3} {:location "scarborough" :cost 4})
      :preston ({:location "liverpool" :cost 4} {:location "manchester" :cost 3} {:location "warrington" :cost 4} {:location "blackburn" :cost 2})
      :blackburn ({:location "wigan" :cost 4} {:location "manchester" :cost 6})
      :runcorn ({:location "liverpool" :cost 2} {:location "manchester" :cost 2} {:location "warrington" :cost 2})
      :wigan    ({:location "warrington" :cost 3} {:location "manchester" :cost 4} {:location "liverpool" :cost 2} )
      :whitby ({:location "scarborough" :cost 2} {:location "york" :cost 4} {:location "hull" :cost 4})
      :hull ({:location "whitby" :cost 4} {:location "york" :cost 7})
      :doncaster({:location "leeds" :cost 6} {:location "york" :cost 7}{:location "nottingham" :cost 5} {:location "rotherham" :cost 2})
      :rotherham ({:location "chesterfield" :cost 5} {:location "sheffield" :cost 3})
      :chesterfield ({:location "manchester" :cost 6} {:location "sheffield" :cost 3} {:location "stokeontrent" :cost 5})
      :stokeontrent ({:location "warrington" :cost 4} {:location "macnhester" :cost 4})
      :harrogate ({:location "leeds" :cost 5} {:location "york" :cost 2})
      :leeds ({:location "manchester" :cost 18} {:location "bradford" :cost 1} {:location "york" :cost 6} {:location "wakefield" :cost 3}{:location "sheffield" :cost 5}{:location "hudderfield" :cost 3})
      :bradford ({:location "1eeds" :cost 5} {:location "huddersfield" :cost 2}{:location "halifax" :cost 3}  )
      :halifax ({:location "leeds" :cost 5} {:location "  rochdale" :cost 4}{:location "hudderfield" :cost 2}  )
      :rochdale ({:location "manchester" :cost 3 } {:location "  bolton" :cost 2}{:location "hudderfield" :cost 5}  )
      :sheffield ({:location "manchester" :cost 9} {:location "york" :cost 6} {:location "leeds" :cost 3} {:location "nottingham" :cost 4})
      :nottingham ({:location "manchester" :cost 7} {:location "york" :cost 9} {:location "leeds" :cost 5}{:location "sheffield" :cost 5})
      :huddersfield ({:location "manchester" :cost 6} {:location "york" :cost 8} {:location "leeds" :cost 3})
      :wakefield  ({:location "manchester" :cost 9} {:location "york" :cost 6} {:location "leeds" :cost 3})
      :manchester ({:location "liverpool" :cost 10} {:location "warrington" :cost 3} {:location "bolton" :cost 4} {:location "newport" :cost 12} {:location "macclesfield" :cost 2} )
      :warrington ({:location "manchester" :cost 3} {:location "bolton" :cost 4} {:location "liverpool" :cost 5})
      :macclesfield ({:location "manchester" :cost 2} {:location "stokeonetrent" :cost 2} {:location "warrington" :cost 3})
      :newport ({:location "manchester" :cost 14} {:location "chester" :cost 7} {:location "liverpool" :cost 8})
      :bolton   ({:location "manchester" :cost 4} {:location "rochdale" :cost 3} {:location "liverpool" :cost 4})
      :liverpool ( {:location "warrington" :cost 2} {:location "manchester" :cost 7} {:location "chester" :cost 4})
})
