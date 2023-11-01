package com.example.mvvmnavigation.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmnavigation.R
import com.example.mvvmnavigation.navigation.ROUTE_ABOUT
import com.example.mvvmnavigation.navigation.ROUTE_LOGIN
import com.example.mvvmnavigation.navigation.ROUTE_PRODUCTS
import com.example.mvvmnavigation.navigation.ROUTE_SIGNUP
import com.example.mvvmnavigation.ui.theme.MVVMNavigationTheme

@Composable
fun HomeScreen(navController: NavController){




//    Column(
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Button(onClick = {
//            navController.navigate(ROUTE_PRODUCTS)
//        }) {
//            Text(text = "Products")
//        }
//        Button(onClick = {
//            navController.navigate(ROUTE_SIGNUP)
//        }) {
//            Text(text = "SignUp")
//        }
//        Button(onClick = {
//            navController.navigate(ROUTE_ABOUT)
//        }) {
//            Text(text = "About")
//        }
//        Button(onClick = {
//            navController.navigate(ROUTE_LOGIN)
//        }) {
//            Text(text = "Login")
//        }



        Column (
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = "My cards app",
                color = Color.Blue,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(top = 16.dp, bottom = 16.dp)
                    .fillMaxWidth()
                    .size(30.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Green
                    ),

                    modifier = Modifier
                        .height(200.dp)
                        .width(180.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.baseline_phone_android_24),
                                contentDescription = "phone",
                                tint = Color.White,

                                )
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.White)
                                .height(70.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Text(
                                text = "Mobile"
                            )
                            Divider()
                            Text(text = "New range of mobile")
                        }

                    }

                }

                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Red
                    ),

                    modifier = Modifier
                        .height(200.dp)
                        .width(180.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.baseline_attach_money_24),
                                contentDescription = "phone",
                                tint = Color.White,

                                )
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.White)
                                .height(70.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Text(
                                text = "Recharge"
                            )
                            Divider()
                            Text(text = "New range of mobile")
                        }

                    }

                }
            }


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, bottom = 16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Blue
                    ),

                    modifier = Modifier
                        .height(200.dp)
                        .width(180.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.baseline_phone_android_24),
                                contentDescription = "phone",
                                tint = Color.White,

                                )
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.White)
                                .height(70.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Text(
                                text = "Mobile"
                            )
                            Divider()
                            Text(text = "New range of mobile")
                        }

                    }

                }

                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Yellow
                    ),

                    modifier = Modifier
                        .height(200.dp)
                        .width(180.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.baseline_phone_android_24),
                                contentDescription = "phone",
                                tint = Color.White,

                                )
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.White)
                                .height(70.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Text(
                                text = "Mobile"
                            )
                            Divider()
                            Text(text = "New range of mobile")
                        }

                    }

                }
            }

//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(top = 16.dp, bottom = 16.dp),
//                horizontalArrangement = Arrangement.SpaceEvenly
//            ) {
//                Card(
//                    colors = CardDefaults.cardColors(
//                        containerColor = Color.Magenta
//                    ),
//
//                    modifier = Modifier
//                        .height(200.dp)
//                        .width(180.dp)
//                ) {
//                    Column(
//                        modifier = Modifier.fillMaxSize(),
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        verticalArrangement = Arrangement.SpaceEvenly
//                    ) {
//                        Column(
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .height(130.dp),
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                            verticalArrangement = Arrangement.Center
//                        ) {
//                            Icon(
//                                painter = painterResource(id = R.drawable.baseline_phone_android_24),
//                                contentDescription = "phone",
//                                tint = Color.White,
//
//                                )
//                        }
//                        Column(
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .background(Color.White)
//                                .height(70.dp),
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                            verticalArrangement = Arrangement.SpaceEvenly
//                        ) {
//                            Text(
//                                text = "Mobile"
//                            )
//                            Divider()
//                            Text(text = "New range of mobile")
//                        }
//
//                    }
//
//                }
//                Card(
//                    colors = CardDefaults.cardColors(
//                        containerColor = Color.DarkGray
//                    ),
//
//                    modifier = Modifier
//                        .height(200.dp)
//                        .width(180.dp)
//                ) {
//                    Column(
//                        modifier = Modifier.fillMaxSize(),
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        verticalArrangement = Arrangement.SpaceEvenly
//                    ) {
//                        Column(
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .height(130.dp),
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                            verticalArrangement = Arrangement.Center
//                        ) {
//                            Icon(
//                                painter = painterResource(id = R.drawable.baseline_phone_android_24),
//                                contentDescription = "phone",
//                                tint = Color.White,
//
//                                )
//                        }
//                        Column(
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .background(Color.White)
//                                .height(70.dp),
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                            verticalArrangement = Arrangement.SpaceEvenly
//                        ) {
//                            Text(
//                                text = "Mobile",
//
//                                )
//                            Divider()
//                            Text(text = "New range of mobile")
//                        }
//
//                    }
//
//                }
//            }

            BottomAppBar(
                modifier = Modifier
                    .background(Color.Transparent)
                    .fillMaxWidth().padding(top = 40.dp)


            ) {
                IconButton(
                    onClick = {
                        navController.navigate(ROUTE_PRODUCTS)
                    },
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_home_24),
                        contentDescription = "home"
                    )
//            Icon(imageVector = Icons.Default.home, contentDescription = )
                    Text(
                        text = "Home",
                        modifier = Modifier.padding(top = 35.dp, bottom = 1.dp)
                    )
                }
                IconButton(
                    onClick = {
                        navController.navigate(ROUTE_SIGNUP)
                    },
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_account_balance_wallet_24),
                        contentDescription = "wallet"
                    )
                    Text(
                        text = "wallet",
                        modifier = Modifier.padding(top = 35.dp, bottom = 1.dp)
                    )
                }
                IconButton(
                    onClick = {
                        navController.navigate(ROUTE_ABOUT)
                    },
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_supervised_user_circle_24),
                        contentDescription = "p2p"
                    )
                    Text(
                        text = "p2p",
                        modifier = Modifier.padding(top = 40.dp, bottom = 1.dp)
                    )
                }
                IconButton(
                    onClick = {
                        navController.navigate(ROUTE_LOGIN)
                    },
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_settings_24),
                        contentDescription = "settings"
                    )
                    Text(
                        text = "settings",
                        modifier = Modifier.padding(top = 35.dp, bottom = 1.dp)
                    )
                }
            }


        }

        }

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    MVVMNavigationTheme {
        HomeScreen(rememberNavController())
    }
}