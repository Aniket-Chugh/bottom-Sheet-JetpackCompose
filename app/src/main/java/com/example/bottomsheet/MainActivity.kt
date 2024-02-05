package com.example.bottomsheet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bottomsheet.ui.theme.BottomSheetTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomSheetTheme {
                val sheetState = rememberModalBottomSheetState()
                var isSheetOpen by rememberSaveable {
                    mutableStateOf(false)
                }

                Box(modifier = Modifier.fillMaxWidth() ,
                    contentAlignment = Alignment.Center){
                    Button(onClick = {
                        isSheetOpen = true
                    }) {
                        Text(text = "Sent Proposal")
                    }
                }


                Box(modifier = Modifier.fillMaxWidth() ,
                    contentAlignment = Alignment.Center){
                    Button(onClick = {
                        isSheetOpen = true
                    }) {
                        Text(text = "Sent Proposal")
                    }
                }

                if (isSheetOpen){
                    ModalBottomSheet(

                        sheetState = sheetState,

                        onDismissRequest = {
                            isSheetOpen = false
                        }) {


                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(8.dp)
                                        .clickable {
                                            isSheetOpen = false

                                        }
                                ) {

                                    Column {
                                        Row {
                                            Text(text = "Proposal Sent" , fontSize = 30.sp)
                                            Icon(imageVector = Icons.Default.CheckCircle, contentDescription = null )
                                        }
                                        Spacer(modifier = Modifier.padding(bottom = 12.dp))
                                        Text(
                                            text = "Your proposal has been submitted , our team will definitly  be notified and review it and will get back to you as soon as possible",
                                            fontSize = 12.sp)
                                        Button(onClick = {
                                                         isSheetOpen = false
                                        },
                                            modifier = Modifier.fillMaxWidth()
                                        ) {
                                            Text(text = "Done")
                                        }
                                    }

                                }
                                

                        }
                    }
                }

            }
        }
    }






