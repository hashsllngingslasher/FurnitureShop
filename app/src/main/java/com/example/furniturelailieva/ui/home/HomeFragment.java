package com.example.furniturelailieva.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.airbnb.lottie.LottieAnimationView;
import com.example.furniturelailieva.R;
import com.example.furniturelailieva.databinding.FragmentHomeBinding;
import com.example.furniturelailieva.models.CategoryModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    List<CategoryModel> list_category = new ArrayList<>();
    CategoryAdapter adapter;
    LottieAnimationView lotty_sale;
    LottieAnimationView lotty_mebel;

    NavController navController;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        lotty_mebel=binding.lottyMebel;
        lotty_mebel.setAnimation(R.raw.lottymebel);

        lotty_sale = binding.lottySale;
        lotty_sale.setAnimation(R.raw.sale_furn4);


        createList();
        adapter = new CategoryAdapter();
        adapter.setMain_list(list_category);
        binding.rvCatalogCategory.setAdapter(adapter);

        return root;
    }

    private void createList() {
        list_category.add(new CategoryModel("Для спальни", R.drawable.bed1));
        list_category.add(new CategoryModel("Для гостинной",R.drawable.divan));
        list_category.add(new CategoryModel("Кухонная мебель", R.drawable.pianoallegro));
        list_category.add(new CategoryModel("Мебель для детских",R.drawable.child4));
        list_category.add(new CategoryModel("Садовая мебель", R.drawable.sad3));
        list_category.add(new CategoryModel("Мебель для прихожей",R.drawable.divan6));

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.saleCardView.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_home_to_saleFragment);
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}