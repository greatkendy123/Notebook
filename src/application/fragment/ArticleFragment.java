package application.fragment;

import application.view.View;

public class ArticleFragment extends Fragment {

	@Override
	public void onCreate() {

	}

	@Override
	public void onDestroy() {

	}

	@Override
	View onCreateView() {
		return null;
	}

	@Override
	String getLayout() {
		return "fragment_article";
	}

	@Override
	boolean isAdded() {
		return false;
	}

}