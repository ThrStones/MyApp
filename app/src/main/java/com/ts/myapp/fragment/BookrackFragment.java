package com.ts.myapp.fragment;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.ts.myapp.R;
import com.ts.myapp.adapter.GridViewNovelAdapter;
import com.ts.myapp.bean.NovelInfo;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.LinkedList;

public class BookrackFragment extends Fragment {

//    private GridView gv_novelList;
    private TextView tv_message;

    private LinkedList<NovelInfo> novelInfoList = new LinkedList<>();
    private GridViewNovelAdapter gridViewNovelAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bookrack, container, false);
        tv_message = view.findViewById(R.id.bookrack_message);
        return view;
//        View view = inflater.inflate(R.layout.fragment_bookrack, container, false);
//
//        gv_novelList = view.findViewById(R.id.gv_novel_list);
//
//        // 要访问的URL
//        String url = "http://192.168.0.114:8086/novelInfo/novelList";
//
//        //Volley的请求队列
//        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
//
//        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(url, new Response.Listener<JSONArray>() {
//
//            @Override
//            public void onResponse(JSONArray response) {
//                try {
////                    Toast.makeText(getActivity(), "Response: " + response.length(), Toast.LENGTH_SHORT).show();
//                    for (int i = 0; i < response.length(); i++) {
//                        JSONObject novelInfo = response.getJSONObject(i);
//                        novelInfoList.add(new NovelInfo(R.mipmap.gridview_book, novelInfo.getInt("id"), novelInfo.getString("name")));
//                    }
//                    gridViewNovelAdapter = new GridViewNovelAdapter(novelInfoList, getContext());
//                    gv_novelList.setAdapter(gridViewNovelAdapter);
//                    gv_novelList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//                        @Override
//                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                            TextView textView = view.findViewById(R.id.tv_novel_id);
//                            Toast.makeText(getContext(), textView.getText().toString(), Toast.LENGTH_SHORT).show();
//                            // 要访问的URL：http://192.168.0.114:8086/chapter/chapterList?id=5&page=0&size=20
////                            String url = "http://192.168.0.114:8086/novelInfo/novelInfo?id=" + textView.getText().toString();
//
//                            String url = "http://192.168.0.114:8086/chapter/chapterList?id=" + textView.getText().toString() + "&page=0&size=20";
//
//                            RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
//
//                            /**
//                             * JsonObjectRequest(int method, String url, JSONObject jsonRequest, Listener<JSONObject> listener, ErrorListener errorListener)
//                             method 请求方式
//                             url请求路径
//                             */
//                            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
//                                @Override
//                                public void onResponse(JSONObject jsonObject) {
//                                    Toast.makeText(getActivity(), "volleyGetJsonMonth请求成功:" + jsonObject, Toast.LENGTH_SHORT).show();
//                                }
//                            }, new Response.ErrorListener() {
//                                @Override
//                                public void onErrorResponse(VolleyError volleyError) {
//                                    Toast.makeText(getActivity(), "volleyGetJsonMonth请求失败", Toast.LENGTH_SHORT).show();
//                                }
//                            });
//
//                            jsonObjectRequest.setTag("jsonObjectRequest");
//                            requestQueue.add(jsonObjectRequest);
//                        }
//                    });
//
//                } catch (
//                        Exception e)
//
//                {
//                    e.printStackTrace();
//                }
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Toast.makeText(getActivity(), "网络异常！", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        //设置该请求的Tag
//        jsonArrayRequest.setTag("JsonArrayGET");
//        //把该请求添加到requestQueue中
//        requestQueue.add(jsonArrayRequest);
//
//        return view;
    }


}
