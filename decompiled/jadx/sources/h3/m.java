package h3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends x1.w0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f4766u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f4767v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f4768w;

    public m(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.textBatchCards);
        jc.i.d(viewFindViewById, "findViewById(...)");
        this.f4766u = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.textBatchMeta);
        jc.i.d(viewFindViewById2, "findViewById(...)");
        this.f4767v = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.btnBatchOptions);
        jc.i.d(viewFindViewById3, "findViewById(...)");
        this.f4768w = (ImageView) viewFindViewById3;
    }
}
