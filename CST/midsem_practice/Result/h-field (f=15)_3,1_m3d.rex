<?xml version="1.0" encoding="UTF-8"?>
<MetaResultFile creator="Solver HFTD - Field 3DFD Monitor" version="20170330">
  <SpecialMaterials>
    <Background type="NORMAL"/>
    <Material name="Copper (pure)" type="FIELDFREE"/>
  </SpecialMaterials>
  <SimulationProperties dB_Amplitude="20" encoded_unit="&amp;U:A^1.:m^-1" fieldname="&lt;name missing&gt;" fieldtype="H-Field" frequency="15"/>
  <MetaGeometryFile filename="model.gex" lod="1"/>
  <SurfaceFieldCoefficients filename="h-field_m3d.coe" type="coe"/>
  <ResultGroups num_steps="1">
    <SharedDataWith treepath="2D/3D Results\Surface Current\surface current (f=15) [3]" rexname="h-field (f=15)_3,1_m3d_sct.rex"/>
    <Frame index="0">
      <FieldResultFile filename="h-field (f=15)_3,1.m3d" type="m3d"/>
    </Frame>
  </ResultGroups>
  <ResultDataType complex="1" timedomain="0" vector="1"/>
  <SimulationDomain min="-11 -6 -50" max="36 31 50"/>
  <PlotSettings Clipping="Possible" Plot="4" ignore_symmetry="0" deformation="0"/>
  <Source type="SOLVER"/>
  <AutoScale>
    <Histogram bins="0 0.06708656996489 0.06798856705427 0.08696020394564 0.116413846612 0.1407063752413 0.1538722664118 0.1739287078381 0.1918296217918 0.1945339739323 0.1974215358496 0.2010572254658 0.2313354462385 0.2416130155325 0.2703566551208 0.3195086419582 0.3272312879562 0.4022234380245 0.4381785690784 0.5121363401413 0.5334081053734 0.5407133102417 0.5832350254059 0.635844707489 0.6850025057793 0.7258542180061 0.7310419678688 0.7559031844139 0.7737678289413 0.8051469922066 0.8110699653625 0.8912529945374 0.892770588398 0.9022803902626 0.9120562076569 0.9510781764984 0.9574474692345 0.9691090583801 0.9796008467674 1.012927889824 1.018320441246 1.030490279198 1.040519833565 1.054198741913 1.060747027397 1.081426620483 1.109716057777 1.189668059349 1.241333603859 1.271872162819 1.327015161514 1.351783275604 1.370953321457 1.423119425774 1.503885269165 1.58266222477 1.622139930725 1.802604675293 1.825562477112 1.892496585846 1.930244922638 1.946938991547 1.958962082863 2.04288816452 2.064074277878 2.162853240967 2.182148218155 2.26185131073 2.402736663818 2.407443523407 2.432671308517 2.433209896088 2.479028463364 2.484226226807 2.502529382706 2.569228649139 2.574773073196 2.581120967865 2.648825645447 2.659957170486 2.678245544434 2.698409080505 2.703566551208 2.711523532867 2.790490627289 2.792466640472 2.870619535446 2.88109087944 2.960502624512 2.973923206329 2.981480360031 2.983485221863 3.017821788788 3.02996301651 3.05176115036 3.055480957031 3.122206687927 3.206248283386 3.24427986145 3.281908750534 3.359106063843 3.417578220367 3.514636516571 3.53290271759 3.559126853943 3.570736646652 3.619076013565 3.741583108902 3.759863376617 3.784993171692 3.800705432892 3.95171880722 3.970207452774 4.055349826813 4.059687137604 4.170899391174 4.244571685791 4.276500225067 4.325706481934 4.357565402985 4.35903263092 4.411307811737 4.424614906311 4.506039619446 4.5158162117 4.562931537628 4.581619739532 4.596063137054 4.670749664307 4.692420482635 4.773992061615 4.808879375458 4.810662269592 4.866419792175 4.867797374725 4.885088443756 4.948623657227 4.951643943787 4.963066101074 5.052657604218 5.067890644073 5.095255374908 5.095598697662 5.136776447296 5.238879680634 5.253636837006 5.260809898376 5.363752365112 5.388347148895 5.396676063538 5.407133102417 5.426640510559 5.432714939117 5.507518768311 5.621627807617 5.677489757538 5.731418609619 5.755642414093 5.771737575531 5.838478565216 5.847574710846 5.860527515411 5.883445739746 5.925533771515 5.947846412659 5.993978023529 6.007821559906 6.014657020569 6.202553272247 6.21820306778 6.241377830505 6.26892375946 6.319230079651 6.35152387619 6.444153308868 6.4885597229 6.488619804382 6.497726917267 6.758916378021 6.85507106781 6.975980758667 6.97963142395 7.023801803589 7.029273033142 7.043256282806 7.056159973145 7.299629688263 7.354461193085 7.35866689682 7.569986343384 7.62542963028 7.673840999603 7.728414535522 7.729277610779 7.794306755066 7.806820392609 7.840342998505 7.842541694641 7.866697311401 8.007637023926 8.048725128174 8.110699653625 8.124127388 8.22829246521 8.267472267151 8.311252593994 8.330679893494 8.381056308746 8.438696861267 8.498909950256 8.50984287262 8.563712120056 8.628877639771 8.632761955261 8.645153045654 8.646317481995 8.651412963867 8.690841674805 8.867224693298 8.912686347961 8.921769618988 9.000504493713 9.081415176392 9.082280158997 9.147827148438 9.192126274109 9.457961082458 9.46248292923 9.732839584351 9.740077972412 9.926291465759 10.00319623947 10.27355289459 10.54390954971 10.81426620483 11.08462285995 11.10005760193 11.35497951508 11.6253361702 11.89569282532 12.16604948044 12.43640613556 12.70676279068 12.9771194458 13.24747610092 13.51783275604 13.78818941116 14.05854606628 14.32890272141 14.59925937653 14.86961603165 15.13997268677 15.41032934189 15.68068599701 15.95104265213 16.22139930725 16.49175596237 16.76211261749 17.03246927261 17.08094787598 17.30282592773 17.57318258286 17.84353923798 18.1138958931 18.38425254822 18.65460920334 18.92496585846 19.19532251358 19.4656791687 19.73603582382 20.00639247894 20.27674913406 20.54710578918 20.81746244431 21.08781909943 21.35817575455 21.62853240967 21.89888906479 22.16924571991 22.43960237503 22.70995903015 22.98031568527 23.25067234039 23.52102899551 23.79138565063 24.06174230576 24.33209896088 24.602455616 24.87281227112 25.14316892624 25.41352558136 25.68388223648 25.9542388916 26.22459554672 26.49495220184 26.76530885696 27.03566551208" values="125607 21 232 333 318 191 244 157 22 18 23 176 61 114 227 31 272 179 359 130 47 208 264 276 235 25 124 80 188 54 343 7 55 36 190 19 37 45 162 27 92 57 82 46 174 163 459 203 145 245 79 75 147 225 246 130 428 79 194 89 52 45 248 48 335 74 170 381 20 83 0 127 16 81 260 14 21 228 40 74 72 19 36 268 6 210 36 260 39 23 10 136 55 90 14 216 273 152 115 207 133 328 62 78 37 167 394 55 46 32 463 90 270 9 362 257 97 160 109 7 175 50 351 43 137 53 43 229 77 277 108 11 229 10 59 222 12 47 366 53 116 1 163 355 54 19 294 114 32 23 55 13 226 413 163 221 74 65 225 16 73 94 131 54 122 54 22 566 38 86 101 140 127 283 115 1 37 861 254 312 8 90 9 29 41 664 189 9 505 145 100 129 3 139 23 78 5 73 339 92 136 43 227 99 131 52 125 129 110 21 124 139 8 36 1 16 71 284 80 16 98 92 3 49 48 269 2 174 7 86 30 51 43 33 18 5 10 12 15 14 8 6 6 5 5 3 2 4 2 3 4 2 1 1 1 2 1 2 1 0 1 1 0 0 0 0 0 0 1 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0"/>
    <InitialPhase value="0"/>
  </AutoScale>
</MetaResultFile>