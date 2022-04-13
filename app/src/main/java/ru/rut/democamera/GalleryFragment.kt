package ru.rut.democamera

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.rut.democamera.databinding.ActivityGalleryBinding
import java.io.File

class GalleryFragment : Fragment() {

    private lateinit var binding: ActivityGalleryBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ActivityGalleryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val directory = File(requireActivity().externalMediaDirs[0].absolutePath)
        val files = directory.listFiles() as Array<File>

        val adapter = GalleryAdapter(files.reversedArray())
        binding.viewPager.adapter = adapter
    }

}