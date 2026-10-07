package l;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f6473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f6474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f6475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f6476d;
    public final ImageView e;

    public w2(View view) {
        this.f6473a = (TextView) view.findViewById(R.id.text1);
        this.f6474b = (TextView) view.findViewById(R.id.text2);
        this.f6475c = (ImageView) view.findViewById(R.id.icon1);
        this.f6476d = (ImageView) view.findViewById(R.id.icon2);
        this.e = (ImageView) view.findViewById(app.namso_gen.spacehowen.R.id.edit_query);
    }
}
